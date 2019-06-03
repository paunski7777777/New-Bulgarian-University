namespace SimpleCalculator.Contracts
{
    public interface IOperation
    {
        decimal Operate(decimal left, decimal right);
    }
}