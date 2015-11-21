package br.aula.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Venda {

    private Long id;

    private Cliente cliente;

    private Date dataVenda;

    private List<Produto> produtos = new ArrayList<>();

}
