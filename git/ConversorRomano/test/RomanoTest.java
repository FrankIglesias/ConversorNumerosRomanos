import org.junit.Assert;
import org.junit.Test;

public class RomanoTest {
	@Test
	public void test1cifra() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(550), "DL");
	}
	@Test
	public void test2cifras() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(69), "LXIX");
	}
	@Test
	public void test1cifras() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(9), "IX");
	}
	@Test
	public void test1000() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(1000), "");
	}
}