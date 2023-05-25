package com.example.damcuoichihuong.service;

import com.example.damcuoichihuong.entity.Guest;
import com.example.damcuoichihuong.repository.GuestRepo;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImp implements GuestService{
    private GuestRepo guestRepo;

    public GuestServiceImp(GuestRepo guestRepo) {
        this.guestRepo = guestRepo;
    }

    @Override
    public Guest insertGuest(Guest guest) {
        return guestRepo.save(guest);
    }

}
