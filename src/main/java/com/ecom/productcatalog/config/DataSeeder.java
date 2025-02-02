package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void run(String... args) throws Exception {
        // Clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Category creation
        Category electronics = new Category();
        electronics.setName("Electronics");
        categoryRepository.save(electronics);

        Category clothing = new Category();
        clothing.setName("Clothing");
        categoryRepository.save(clothing);

        Category home = new Category();
        home.setName("Home and Kitchen");
        categoryRepository.save(home);

        Category sports = new Category();
        sports.setName("Sports & Outdoors");
        categoryRepository.save(sports);

        Category books = new Category();
        books.setName("Books");
        categoryRepository.save(books);

        Category beauty = new Category();
        beauty.setName("Beauty & Personal Care");
        categoryRepository.save(beauty);

        // Electronics Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model smartphone with amazing features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High-performance laptop for work and play.");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription("Noise-cancelling over-ear headphones.");
        headphones.setImageUrl("https://placehold.co/600x400");
        headphones.setPrice(199.99);
        headphones.setCategory(electronics);

        Product tablet = new Product();
        tablet.setName("Tablet");
        tablet.setDescription("10-inch screen tablet with powerful processor.");
        tablet.setImageUrl("https://placehold.co/600x400");
        tablet.setPrice(399.99);
        tablet.setCategory(electronics);

        Product smartWatch = new Product();
        smartWatch.setName("Smart Watch");
        smartWatch.setDescription("Fitness tracking and notifications on the go.");
        smartWatch.setImageUrl("https://placehold.co/600x400");
        smartWatch.setPrice(249.99);
        smartWatch.setCategory(electronics);

        // Clothing Products
        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket for winter.");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product jeans = new Product();
        jeans.setName("Denim Jeans");
        jeans.setDescription("Comfortable and stylish denim jeans.");
        jeans.setImageUrl("https://placehold.co/600x400");
        jeans.setPrice(49.99);
        jeans.setCategory(clothing);

        Product tShirt = new Product();
        tShirt.setName("Graphic T-Shirt");
        tShirt.setDescription("Cotton t-shirt with unique graphic prints.");
        tShirt.setImageUrl("https://placehold.co/600x400");
        tShirt.setPrice(19.99);
        tShirt.setCategory(clothing);

        Product dress = new Product();
        dress.setName("Summer Dress");
        dress.setDescription("Lightweight and breezy dress for summer.");
        dress.setImageUrl("https://placehold.co/600x400");
        dress.setPrice(59.99);
        dress.setCategory(clothing);

        Product sneakers = new Product();
        sneakers.setName("Running Sneakers");
        sneakers.setDescription("Comfortable sneakers for running and casual wear.");
        sneakers.setImageUrl("https://placehold.co/600x400");
        sneakers.setPrice(89.99);
        sneakers.setCategory(clothing);

        // Home and Kitchen Products
        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High-speed blender for smoothies and more.");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(89.99);
        blender.setCategory(home);

        Product coffeeMaker = new Product();
        coffeeMaker.setName("Coffee Maker");
        coffeeMaker.setDescription("Brew fresh coffee easily at home.");
        coffeeMaker.setImageUrl("https://placehold.co/600x400");
        coffeeMaker.setPrice(49.99);
        coffeeMaker.setCategory(home);

        Product toaster = new Product();
        toaster.setName("Toaster");
        toaster.setDescription("2-slice toaster with multiple settings.");
        toaster.setImageUrl("https://placehold.co/600x400");
        toaster.setPrice(29.99);
        toaster.setCategory(home);

        Product vacuum = new Product();
        vacuum.setName("Vacuum Cleaner");
        vacuum.setDescription("Powerful vacuum cleaner for all floor types.");
        vacuum.setImageUrl("https://placehold.co/600x400");
        vacuum.setPrice(159.99);
        vacuum.setCategory(home);

        Product airFryer = new Product();
        airFryer.setName("Air Fryer");
        airFryer.setDescription("Fry your favorite foods with less oil.");
        airFryer.setImageUrl("https://placehold.co/600x400");
        airFryer.setPrice(129.99);
        airFryer.setCategory(home);

        // Sports & Outdoors Products
        Product tent = new Product();
        tent.setName("Camping Tent");
        tent.setDescription("Spacious tent for outdoor adventures.");
        tent.setImageUrl("https://placehold.co/600x400");
        tent.setPrice(199.99);
        tent.setCategory(sports);

        Product yogaMat = new Product();
        yogaMat.setName("Yoga Mat");
        yogaMat.setDescription("Non-slip yoga mat for all exercises.");
        yogaMat.setImageUrl("https://placehold.co/600x400");
        yogaMat.setPrice(39.99);
        yogaMat.setCategory(sports);

        Product bicycle = new Product();
        bicycle.setName("Mountain Bike");
        bicycle.setDescription("Durable bike for off-road trails.");
        bicycle.setImageUrl("https://placehold.co/600x400");
        bicycle.setPrice(499.99);
        bicycle.setCategory(sports);

        Product dumbbells = new Product();
        dumbbells.setName("Adjustable Dumbbells");
        dumbbells.setDescription("Versatile dumbbells for home workouts.");
        dumbbells.setImageUrl("https://placehold.co/600x400");
        dumbbells.setPrice(89.99);
        dumbbells.setCategory(sports);

        Product treadmill = new Product();
        treadmill.setName("Treadmill");
        treadmill.setDescription("Compact treadmill for indoor running.");
        treadmill.setImageUrl("https://placehold.co/600x400");
        treadmill.setPrice(799.99);
        treadmill.setCategory(sports);

        // Books
        Product novel = new Product();
        novel.setName("Mystery Novel");
        novel.setDescription("A gripping mystery novel that keeps you hooked.");
        novel.setImageUrl("https://placehold.co/600x400");
        novel.setPrice(14.99);
        novel.setCategory(books);

        Product cookbook = new Product();
        cookbook.setName("Healthy Cookbook");
        cookbook.setDescription("Delicious and healthy recipes for all.");
        cookbook.setImageUrl("https://placehold.co/600x400");
        cookbook.setPrice(24.99);
        cookbook.setCategory(books);

        Product biography = new Product();
        biography.setName("Famous Biography");
        biography.setDescription("Inspiring biography of a world leader.");
        biography.setImageUrl("https://placehold.co/600x400");
        biography.setPrice(19.99);
        biography.setCategory(books);

        Product childrenBook = new Product();
        childrenBook.setName("Children's Storybook");
        childrenBook.setDescription("Fun and colorful stories for kids.");
        childrenBook.setImageUrl("https://placehold.co/600x400");
        childrenBook.setPrice(9.99);
        childrenBook.setCategory(books);

        Product scienceBook = new Product();
        scienceBook.setName("Science Textbook");
        scienceBook.setDescription("Comprehensive science textbook for students.");
        scienceBook.setImageUrl("https://placehold.co/600x400");
        scienceBook.setPrice(49.99);
        scienceBook.setCategory(books);

        // Beauty & Personal Care Products
        Product shampoo = new Product();
        shampoo.setName("Herbal Shampoo");
        shampoo.setDescription("Natural ingredients for healthy hair.");
        shampoo.setImageUrl("https://placehold.co/600x400");
        shampoo.setPrice(12.99);
        shampoo.setCategory(beauty);

        Product moisturizer = new Product();
        moisturizer.setName("Facial Moisturizer");
        moisturizer.setDescription("Hydrates and nourishes the skin.");
        moisturizer.setImageUrl("https://placehold.co/600x400");
        moisturizer.setPrice(19.99);
        moisturizer.setCategory(beauty);

        Product lipstick = new Product();
        lipstick.setName("Matte Lipstick");
        lipstick.setDescription("Long-lasting matte finish lipstick.");
        lipstick.setImageUrl("https://placehold.co/600x400");
        lipstick.setPrice(15.99);
        lipstick.setCategory(beauty);

        Product sunscreen = new Product();
        sunscreen.setName("Sunscreen Lotion");
        sunscreen.setDescription("Broad spectrum SPF 50 protection.");
        sunscreen.setImageUrl("https://placehold.co/600x400");
        sunscreen.setPrice(17.99);
        sunscreen.setCategory(beauty);

        Product perfume = new Product();
        perfume.setName("Eau de Parfum");
        perfume.setDescription("Long-lasting fragrance for all occasions.");
        perfume.setImageUrl("https://placehold.co/600x400");
        perfume.setPrice(49.99);
        perfume.setCategory(beauty);

        // Save all products
        productRepository.saveAll(Arrays.asList(
                phone, laptop, headphones, tablet, smartWatch,
                jacket, jeans, tShirt, dress, sneakers,
                blender, coffeeMaker, toaster, vacuum, airFryer,
                tent, yogaMat, bicycle, dumbbells, treadmill,
                novel, cookbook, biography, childrenBook, scienceBook,
                shampoo, moisturizer, lipstick, sunscreen, perfume
        ));
    }

}
