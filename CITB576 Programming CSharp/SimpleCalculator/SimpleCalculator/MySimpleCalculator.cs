namespace SimpleCalculator
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.Composition;

    using SimpleCalculator.Contracts;

    [Export(typeof(ICalculator))]
    public class MySimpleCalculator : ICalculator
    {
        [ImportMany]
        IEnumerable<Lazy<IOperation, IOperationData>> operations;

        public string Calculate(string input)
        {
            if (input.Equals("exit"))
            {
                Environment.Exit(0);
            }

            decimal left;
            decimal right;
            char operation;
            int fn = FindFirstNonDigit(input); //finds the operator

            if (fn < 0)
            {
                return "Could not parse command.";
            }

            try
            {
                //separate out the operands
                left = decimal.Parse(input.Substring(0, fn));
                right = decimal.Parse(input.Substring(fn + 1));
            }
            catch
            {
                return "Could not parse command.";
            }

            operation = input[fn];

            foreach (Lazy<IOperation, IOperationData> i in operations)
            {
                if (i.Metadata.Symbol.Equals(operation))
                {
                    return i.Value.Operate(left, right).ToString();
                }
            }

            return "Operation Not Found!";
        }

        private int FindFirstNonDigit(string s)
        {
            for (int i = 0; i < s.Length; i++)
            {
                if (!(char.IsDigit(s[i])) && !s[i].Equals('.'))
                {
                    return i;
                }
            }

            return -1;
        }
    }
}