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
	
	@Test(expected=RuntimeException.class)
	public void test1000() {
		Romanos romano = new Romanos();
		romano.convertirARomano(1000);
	}
	
	@Test
	public void test0() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(0), "");
	}
	@Test
	public void test17() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(17), "XVII");
	}
	@Test
	public void test32() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(32), "XXXII");
	}
	@Test
	public void test752() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(752), "DCCLII");
	}
	
	@Test
	public void test325() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(325), "CCCXXV");
	}
	
	@Test
	public void test925() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(925), "CMXXV");
	}
	
	@Test
	public void test569() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(569), "DLXIX");
	}
	
	@Test
	public void test328() {
		Romanos romano = new Romanos();
		Assert.assertEquals(romano.convertirARomano(328), "CCCXXVIII");
	}

}