package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.RequestDTO.RequestClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.ResponseDTO.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;

public interface ConverterCliente < M extends Cliente, R extends ResponseClienteDTO> {
 R convert( M cliente);
 M convert(RequestClienteDTO clienteDTO);
}
