package org.schorn.ella.app.receipt;

public interface IAppReceipt {

    boolean OK();

    /**
     * An alternative to throwing an undeclared exception, the implementor can include the exception
     * into the receipt and the caller can release the exception at will.
     *
     * @throws Exception
     */
    void throwException() throws Exception;
    boolean hasException();
}
