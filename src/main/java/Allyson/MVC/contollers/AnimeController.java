package Allyson.MVC.contollers;

import Allyson.MVC.models.AnimeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animes")
public class AnimeController {

    private static List<AnimeModel> animes = new ArrayList<AnimeModel>();

    public AnimeController() {
        animes.add(new AnimeModel(
                "Jujutsu Kaisen (2020 - presente)",
                "Em exibição (24 episódios + 1 filme)",
                "Shōnen, ação")
        );
        animes.add(new AnimeModel(
                "Demon Slayer (Kimetsu no Yaiba) (2019 - presente)",
                "Em produção / 2019 - presente (44 episódios + 1 filme)",
                "Shōnen")
        );
        animes.add(new AnimeModel(
                "Attack on Titan (Shingeki no Kyojin) (2013 - 2023)",
                "Em exibição (75 episódios + 8 OVAs)",
                "Shonen/Seinen")
        );
    }
    @GetMapping
    public String getAnimes(Model model) {
            model.addAttribute("animes", this.animes);
            return "animes";
    }

}
