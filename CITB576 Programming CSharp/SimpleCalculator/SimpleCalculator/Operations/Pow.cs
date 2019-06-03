namespace SimpleCalculator.Operations
{
    using SimpleCalculator.Contracts;

    using System;
    using System.ComponentModel.Composition;

    [Export(typeof(IOperation))]
    [ExportMetadata("Symbol", '^')]
    public class Pow : IOperation
    {
        public decimal Operate(decimal left, decimal right)
        {
            return (decimal)Math.Pow((double)left, (double)right);
        }
    }
}