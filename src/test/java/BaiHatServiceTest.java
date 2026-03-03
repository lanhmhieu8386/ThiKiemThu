import org.example.Entity.BaiHat;
import org.example.Service.BaiHatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BaiHatServiceTest {

    BaiHatService service;

    @BeforeEach
    public void setUp() {
        service = new BaiHatService();
    }

    @Test
    public void testAddThanhCong() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH001", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 3.5f, "Chữ tình");
        service.add(entity);

        Assert.assertEquals(sizeTruoc + 1, service.size());

    }

    @Test
    public void testAddBienMin() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH002", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 2f, "Chữ tình");
        service.add(entity);

        Assert.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMinCong1() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH003", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 2.1f, "Chữ tình");
        service.add(entity);

        Assert.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMinTru1() {
        BaiHat entity = new BaiHat("BH004", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 1.9f, "Chữ tình");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(entity));
    }

    @Test
    public void testAddBienMax() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH005", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 5.59f, "Chữ tình");
        service.add(entity);

        Assert.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMaxTru1() {
        int sizeTruoc = service.size();
        BaiHat entity = new BaiHat("BH005", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 5.4f, "Chữ tình");
        service.add(entity);

        Assert.assertEquals(sizeTruoc + 1, service.size());
    }

    @Test
    public void testAddBienMaxCong1() {
        BaiHat entity = new BaiHat("BH004", "Bài hát đầu tiên", "Lãnh Minh Hiếu", 6f, "Chữ tình");
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(entity));
    }
}
