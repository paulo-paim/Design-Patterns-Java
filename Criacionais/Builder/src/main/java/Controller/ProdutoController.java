package Controller;

import Builder.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<Produto> create(){

        Produto.Builder builder = new Produto.Builder();
        Produto produto = builder
                .nome("Iphone")
                .preco(5000d)
                .quantidadeEmEstoque(33)
                .build();

        return new ResponseEntity<>(produto, HttpStatus.OK);


    }
}
