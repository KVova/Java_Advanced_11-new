package volodymyr.application;

import java.sql.Date;
import volodymyr.domain.Bucket;
import volodymyr.domain.Magazine;
import volodymyr.domain.User;
import volodymyr.service.BucketService;
import volodymyr.service.MagazineService;
import volodymyr.service.UserService;
import volodymyr.service.impl.BucketServiceImpl;
import volodymyr.service.impl.MagazineServiceImpl;
import volodymyr.service.impl.UserServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		
		userService.create(new User(1,"Volodya", "Karmazy", 24 ,"Lutsk", "K_Vova@gmail.com"));
		userService.create(new User(3, "Woldmyr", "Karmaz", 24 ,"Lviv", "VolodymyrKarmazy@gmail.com"));
		System.out.println(userService.read(1));
		userService.update(new User(2, "Oleg", "Olexandrivskiy", 27, "Kuiv", "oleg@ukr.net"));
		System.out.println(userService.read(2));
		userService.delete(2);
		System.out.println(userService.readAll());
		
		
		MagazineService magazineService = new MagazineServiceImpl();
		
		magazineService.create(new Magazine(3, "Car and Peoples", 49.99, 105));
		magazineService.create(new Magazine(55, "Gardens", 29.87, 15));
		magazineService.delete(3);
		magazineService.readAll();
		magazineService.update(new Magazine(55, "Gardens", 12.50, 24));
		System.out.println(magazineService.read(55));
		System.out.println(magazineService.readAll());
		
		
		BucketService bucketService = new BucketServiceImpl();
		
		bucketService.create(new Bucket(2, 1, Date.valueOf("2020-05-20")));
		bucketService.create(new Bucket(1, 2, Date.valueOf("2020-05-19")));
		System.out.println(bucketService.read(3));
		System.out.println(bucketService.update(new Bucket(1, 2, Date.valueOf("2020-06-12"))));
		bucketService.delete(3);
		System.out.println(bucketService.readAll());
		
	}
	
}
