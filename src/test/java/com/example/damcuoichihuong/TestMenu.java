package com.example.damcuoichihuong;

import com.example.damcuoichihuong.entity.Gift;
import com.example.damcuoichihuong.entity.Guest;
import com.example.damcuoichihuong.entity.Menu;
import com.example.damcuoichihuong.entity.Product;
import com.example.damcuoichihuong.repository.GiftRepo;
import com.example.damcuoichihuong.repository.GuestRepo;
import com.example.damcuoichihuong.repository.MenuRepo;
import com.example.damcuoichihuong.repository.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestMenu {
    @Autowired
    private MenuRepo menuRepo;

    @Autowired
    private GuestRepo guestRepo;
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private GiftRepo giftRepo;

    @Test
    @Rollback(value = false)
    void insertMenu() {
        menuRepo.save(new Menu(1, "Tôm hùm hấp xả", 3000000));
        menuRepo.save(new Menu(2, "Bạch tuộc xào lăn", 1000000));
        menuRepo.save(new Menu(3, "Cơm chiên Dương Châu", 500000));
        menuRepo.save(new Menu(4, "Cua Hoàng Đế hấp bia",4000000));
        menuRepo.save(new Menu(5, "Xôi chim", 300000));
        menuRepo.save(new Menu(6, "Bào ngư xào xả ớt", 800000));
        menuRepo.save(new Menu(7, "Bò dát vàng", 4000000));
        menuRepo.save(new Menu(8, "Súp gà nấu bắp non", 600000));
        menuRepo.save(new Menu(9, "Nấm bào ngư xào dầu hào", 1500000));
        menuRepo.save(new Menu(10, "Chè thạch ngũ sắc", 200000));
    }

    @Test
    @Rollback(value = false)
    void insertGuest() {
        guestRepo.save(new Guest(1, "Lung Thị Linh", "01934425252", "Hải Phòng"));
        guestRepo.save(new Guest(2, "Trần Văn Tèo", "01934425252", "Hà Nội"));
        guestRepo.save(new Guest(3, "Lung Thị Lang", "01934425252", "Hải Phòng"));
        guestRepo.save(new Guest(4, "Lương Quý Nhân", "01934425252", "Hải Dương"));
        guestRepo.save(new Guest(5, "Lung Thị Linh", "01934425252", "Nam Định"));
        guestRepo.save(new Guest(6, "Nguyễn Thị Ái", "01934425252", "Hải Phòng"));
        guestRepo.save(new Guest(7, "Dương Văn Tây", "01934425252", "Thái Bình"));
        guestRepo.save(new Guest(8,"Lã Thuỳ Ân", "01934425252", "Hải Phòng"));
        guestRepo.save(new Guest(9, "Lê Thành Đạt", "01934425252", "Hải Phòng"));
        guestRepo.save(new Guest(10, "Trần Văn Mách", "01934425252", "Hải Phòng"));
    }

    @Test
    @Rollback(value = false)
    void insertProduct() {
        productRepo.save(new Product(1, "Thịt bò", 300000, 20 ,"kg", "Mua"));
        productRepo.save(new Product(2,"Thịt lợn", 150000, 60 ,"kg", "Mua"));
        productRepo.save(new Product(3, "Tôm", 500000, 30 ,"kg", "Mua"));
        productRepo.save(new Product(4, "Bàn", 300000, 50 ,"cái", "Thuê"));
        productRepo.save(new Product(5, "Ghế", 1500000, 200 ,"cái", "Thuê"));
        productRepo.save(new Product(6, "Gạo", 30000, 20 ,"kg", "Mua"));
        productRepo.save(new Product(7, "Hải sản", 800000, 40 ,"kg", "Mua"));
        productRepo.save(new Product(8,"Bát đũa", 50000, 20 ,"bộ", "Thuê"));
        productRepo.save(new Product(9, "Thịt bò", 300000, 20 ,"kg", "Mua"));
        productRepo.save(new Product(10, "Thịt bò", 300000, 20 ,"kg", "Mua"));
    }

    @Test
    @Rollback(value = false)
    void insertGift() {
        giftRepo.save(new Gift(1, 1, 300000));
        giftRepo.save(new Gift(2,2, 500000));
        giftRepo.save(new Gift(3, 3, 3000000));
        giftRepo.save(new Gift(4, 4, 1000000));
        giftRepo.save(new Gift(5, 5, 2000000));
        giftRepo.save(new Gift(6, 6, 300000));
        giftRepo.save(new Gift(7, 7, 500000));
        giftRepo.save(new Gift(8,8, 500000));
        giftRepo.save(new Gift(9,9, 200000));
        giftRepo.save(new Gift(10, 10, 100000));
    }
}
