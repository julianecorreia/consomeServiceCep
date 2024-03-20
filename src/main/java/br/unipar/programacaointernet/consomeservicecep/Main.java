package br.unipar.programacaointernet.consomeservicecep;

import java.io.*;
import java.rmi.RemoteException;

import br.unipar.programacaointernet.axis2.EnderecoSIBServiceStub;
import org.apache.axis2.AxisFault;

public class Main {

    public static void main(String[] args) {
        try {
            EnderecoSIBServiceStub stub = new EnderecoSIBServiceStub();
            EnderecoSIBServiceStub.ConsultaPorCep consulta =
                    new EnderecoSIBServiceStub.ConsultaPorCep();

            consulta.setCep("85800-000");

            EnderecoSIBServiceStub.ConsultaPorCepE consultaE =
                    new EnderecoSIBServiceStub.ConsultaPorCepE();
            consultaE.setConsultaPorCep(consulta);

            EnderecoSIBServiceStub.ConsultaPorCepResponse response =
                    stub.consultaPorCep(consultaE).getConsultaPorCepResponse();

            EnderecoSIBServiceStub.Endereco endereco = response.get_return();
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getBairro());
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}