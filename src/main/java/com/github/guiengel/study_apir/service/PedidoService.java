package com.github.guiengel.study_apir.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.guiengel.study_apir.dto.pedido.PedidoRequestCreate;
import com.github.guiengel.study_apir.dto.pedido.PedidoRequestUpdate;
import com.github.guiengel.study_apir.model.Item;
import com.github.guiengel.study_apir.model.Pedido;
import com.github.guiengel.study_apir.model.Produto;
import com.repository.ItemRepository;
import com.repository.PedidoRepository;
import com.repository.ProdutoRepository;


@Service
public class PedidoService {
    @Autowired
    private ItemRepository itemRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;

    public Pedido create(PedidoRequestCreate dto){
        return null;
    }
}
