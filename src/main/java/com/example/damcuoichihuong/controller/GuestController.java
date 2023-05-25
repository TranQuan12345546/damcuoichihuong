package com.example.damcuoichihuong.controller;

import com.example.damcuoichihuong.entity.Guest;
import com.example.damcuoichihuong.entity.Menu;
import com.example.damcuoichihuong.entity.Product;
import com.example.damcuoichihuong.service.GuestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class GuestController {
    private GuestService guestService;
    @PostMapping("/guest")
    public ResponseEntity<?> insertGuest(@RequestBody Guest guest) {
        Guest guest1 = guestService.insertGuest(guest);
        return ResponseEntity.ok(guest1);
    }




}
