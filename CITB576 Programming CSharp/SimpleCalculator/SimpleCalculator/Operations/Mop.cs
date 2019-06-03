namespace ExtendedOperations
{
    using System.ComponentModel.Composition;

    using SimpleCalculator.Contracts;

    [Export(typeof(IOperation))]
    [ExportMetadata("Symbol", '*')]
    public class Mop : IOperation
    {
        public decimal Operate(decimal left, decimal right)
        {
            return left * right;
        }
    }
}