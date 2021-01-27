package com.company.controllers.bindpathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
@RequestMapping("trade")
public class TradeController {

    private static final Logger logger = Logger.getLogger(TradeController.class.getName());

    @RequestMapping
    public String handleTradeRequest(Trade trade, Model model) {

        String msg = String.format("trade request. buySell: %s, buyCurrency: %s, sellCurrency: %s",
                trade.getBuySell(), trade.getBuyCurrency(), trade.getSellCurrency());

        logger.info(msg);
        model.addAttribute("msg", msg);
        return "my-page2";
    }

    @RequestMapping("{buySell}/{buyCurrency}/{sellCurrency}")
    public String handleRequest2(Trade trade, Model model) {

        String msg = String.format("trade request. buySell: %s, buyCurrency: %s, sellCurrency: %s",
                trade.getBuySell(), trade.getBuyCurrency(), trade.getSellCurrency());

        logger.info(msg);
        model.addAttribute("msg", msg);
        return "my-page";
    }

    @RequestMapping("paramTest")
    public String handleRequest(@RequestParam("buySell") String buySell,
                               @RequestParam("buyCurrency") String buyCurrency,
                               @RequestParam("sellCurrency") String sellCurrency,
                                Model model) {

        String msg = String.format("trade request. buySell: %s, buyCurrency: %s, sellCurrency: %s",
                buySell, buyCurrency, sellCurrency);

        logger.info(msg);
        model.addAttribute("msg", msg);
        return "my-page";
    }

    @RequestMapping("pathTest/{buySell}/{buyCurrency}/{sellCurrency}")
    public String handleRequest3(@PathVariable("buySell") String buySell,
                                 @PathVariable("buyCurrency") String buyCurrency,
                                 @PathVariable("sellCurrency") String sellCurrency,
                                 Model model) {

        String msg = String.format("trade request. buySell: %s, buyCurrency: %s, sellCurrency: %s",
                buySell, buyCurrency, sellCurrency);

        logger.info(msg);
        model.addAttribute("msg", msg);
        return "my-page";
    }
}
