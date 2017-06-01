package ru.soap;

import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIP;

public class GeoIpServiceTests {

  @Test
  public void testMyIp() {
    GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("192.168.1.187");

    assertEquals(geoIP.getCountryCode(), "RUS");
  }

  @Test
  public void testInvalidIp() {
    GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("192.168.1.xxx");

    assertEquals(geoIP.getCountryCode(), "RUS");
  }

}
