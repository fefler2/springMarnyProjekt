//package com.example.demo;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class OtherClass {
//
//    @RequestMapping
//    public String  showSmh(){
//        return "abc";
//    }
//
//    @RequestMapping("books")
//    public String showBooks(){
//        return "books";
//    }
//
//    @GetMapping
//    public String showAlfa(String s){
//        return "alfa" + s;
//    }
//
//    @PostMapping("as")
//    public String showAs(){
//        return "asdf";
//    }
//
//    @GetMapping("httperror")
//    public Object returnHTTPError(){
//        return new ResponseEntity(HttpStatus.ACCEPTED);
//
//
//    }
//
//
//
//
//
//}
