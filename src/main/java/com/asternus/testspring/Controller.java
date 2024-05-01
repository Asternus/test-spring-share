package com.asternus.testspring;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@RestController
public class Controller {

    private TextContext textContext;

    @Resource
    public void setTextContext(TextContext textContext) {
        this.textContext = textContext;
    }

    @GetMapping("admin/about")
    @Operation(description = "because", deprecated = true)
    public String getAbout() {
        return "hello world";
    }

    @GetMapping("user/date")
    @ResponseBody
    public Bean getDate() {
        final Bean bean = new Bean();
        bean.setDate(new Date());
        bean.setLocal(LocalDateTime.now());
        return bean;
    }

    @PostMapping("user/create/{id}")
    public Bean create(@PathVariable String id, @RequestParam String guid, @RequestBody Bean bean1) {
        final Bean bean = new Bean();
        System.out.println(guid);
        System.out.println(bean1);
        return bean;
    }

    @GetMapping("user/result")
    public Result getResult(@RequestParam(required = false) String es) {
        if (Objects.nonNull(es)) {
            textContext.setGuid(es);
            textContext.test = es;
        }

        textContext.setCat(es + "JJ");
        textContext.setId(es + "BB");

        System.out.println(textContext);
        System.out.println(textContext.test);

        return new Result("id", "cat");
    }

    @GetMapping("user/test")
    public Result getTest(@ModelAttribute ParamBean requestParams) {
        System.out.println();
        return new Result("id", "cat");
    }

}
