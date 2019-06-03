namespace SimpleCalculator.Operations
{
    using System.ComponentModel.Composition;

    using SimpleCalculator.Contracts;

    [Export(typeof(IOperation))]
    [ExportMetadata("Symbol", '%')]
    public class Mod : IOperation
    {
        public decimal Operate(decimal left, decimal right)
        {
            return left % right;
        }
    }
}