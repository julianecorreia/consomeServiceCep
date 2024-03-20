/**
 * EnderecoSIBServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package br.unipar.programacaointernet.axis2;


/**
 *  EnderecoSIBServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class EnderecoSIBServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public EnderecoSIBServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public EnderecoSIBServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for consultaEnderecos method
     * override this method for handling normal response from consultaEnderecos operation
     */
    public void receiveResultconsultaEnderecos(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.ConsultaEnderecosResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultaEnderecos operation
     */
    public void receiveErrorconsultaEnderecos(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editarEndereco method
     * override this method for handling normal response from editarEndereco operation
     */
    public void receiveResulteditarEndereco(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.EditarEnderecoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editarEndereco operation
     */
    public void receiveErroreditarEndereco(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultaEnderecoPorID method
     * override this method for handling normal response from consultaEnderecoPorID operation
     */
    public void receiveResultconsultaEnderecoPorID(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.ConsultaEnderecoPorIDResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultaEnderecoPorID operation
     */
    public void receiveErrorconsultaEnderecoPorID(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for salvarEndereco method
     * override this method for handling normal response from salvarEndereco operation
     */
    public void receiveResultsalvarEndereco(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.SalvarEnderecoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from salvarEndereco operation
     */
    public void receiveErrorsalvarEndereco(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for boasVindas method
     * override this method for handling normal response from boasVindas operation
     */
    public void receiveResultboasVindas(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.BoasVindasResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from boasVindas operation
     */
    public void receiveErrorboasVindas(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultaPorCep method
     * override this method for handling normal response from consultaPorCep operation
     */
    public void receiveResultconsultaPorCep(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.ConsultaPorCepResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultaPorCep operation
     */
    public void receiveErrorconsultaPorCep(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deletarEndereco method
     * override this method for handling normal response from deletarEndereco operation
     */
    public void receiveResultdeletarEndereco(
        br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub.DeletarEnderecoResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deletarEndereco operation
     */
    public void receiveErrordeletarEndereco(java.lang.Exception e) {
    }
}
