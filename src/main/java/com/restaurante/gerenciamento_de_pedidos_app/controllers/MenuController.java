package com.restaurante.gerenciamento_de_pedidos_app.controllers;

import com.restaurante.gerenciamento_de_pedidos_app.dtos.MenuItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/menu") // Base URL for all methods in this controller
public class MenuController {

    @GetMapping
    public String showMenu(Model model) {
        List<MenuItemDTO> menuItems = Arrays.asList(
                new MenuItemDTO("Cachorro", "https://fortsupermercados.com.br/wp-content/uploads/2023/11/grilled-beef-hot-dog-with-ketchup-snack-generative-ai-scaled.jpg"),
                new MenuItemDTO("Hambúrguer", "https://s2-casavogue.glbimg.com/GRF9KCq-1hiz5uSs-xX9Go_KqIc=/0x0:2048x1365/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_d72fd4bf0af74c0c89d27a5a226dbbf8/internal_photos/bs/2022/p/X/eb4KQdToys327cGqnRGg/receita-ceboloni-bacon.jpg"),
                new MenuItemDTO("Pizza", "https://upload.wikimedia.org/wikipedia/commons/9/91/Pizza-3007395.jpg"),
                new MenuItemDTO("Salada", "https://blog.biglar.com.br/wp-content/uploads/2023/11/salad-from-tomatoes-cucumber-red-onions-lettuce-leaves-healthy-summer-vitamin-menu-vegan-vegetable-food-vegetarian-dinner-table.jpeg"),
                new MenuItemDTO("Batata Frita", "https://gastronomiacarioca.zonasul.com.br/wp-content/uploads/2023/05/batata_frita_destaque_ilustrativo_zona_sul.jpg"),
                new MenuItemDTO("Sorvete", "https://blog.gsuplementos.com.br/wp-content/uploads/2020/11/iStock-1173381958.jpg")
        );
        model.addAttribute("menuItems", menuItems);
        return "menu";
    }
}
