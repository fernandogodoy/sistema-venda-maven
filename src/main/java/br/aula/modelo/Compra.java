package br.aula.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Compra {

    private Long id;

    private Date dataCompra;

    private Fornecedor fornecedor;

    private List<Produto> produtos = new ArrayList<>();
}
