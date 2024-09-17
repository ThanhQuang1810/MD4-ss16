package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("dog", "chó");
        dictionary.put("cat", "mèo");
        dictionary.put("fish", "cá");
        dictionary.put("bird", "chim");
    }

    @GetMapping("/")
    public String showForm() {

        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam("word") String word, Model model) {
        word = word.toLowerCase();
        String meaning = dictionary.get(word);

        if (meaning != null) {
            model.addAttribute("word", word);
            model.addAttribute("meaning", meaning);
        } else {
            model.addAttribute("error", "Không tìm thấy từ: " + word);
        }

        return "result";
    }
}
