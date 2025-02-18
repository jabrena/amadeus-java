package com.amadeus.resources;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

/**
 * A Hotel object as returned by the Hotel List API.
 * @see com.amadeus.referenceData.locations.hotels.ByHotels#get()
 * @see com.amadeus.referenceData.locations.hotels.ByCity#get()
 * @see com.amadeus.referenceData.locations.hotels.ByGeocode#get()
 */
@ToString
public class Hotel extends Resource {
  protected Hotel() {}

  private @Getter String subtype;
  private @Getter String name;
  private @Getter String timeZoneName;
  private @Getter String iataCode;
  private @Getter Address address;
  private @Getter GeoCode geoCode;
  private @Getter String googlePlaceId;
  private @Getter String openjetAirportId;
  private @Getter String uicCode;
  private @Getter String hotelId;
  private @Getter String chainCode;
  private @Getter Distance distance;
  @SerializedName("last_update")
  private @Getter String lastUpdate;

  @ToString
  public class Address {
    protected Address() {}

    private @Getter String category;
    private @Getter String[] lines;
    private @Getter String postalCode;
    private @Getter String countryCode;
    private @Getter String cityName;
    private @Getter String stateCode;
    private @Getter String postalBox;
    private @Getter String text;
    private @Getter String state;
  }

  @ToString
  public class GeoCode {
    protected GeoCode() {}

    private @Getter float latitude;
    private @Getter float longitude;
  }

  @ToString
  public class Distance {
    protected Distance() {}

    private @Getter String unit;
    private @Getter double value;
    private @Getter String displayValue;
    private @Getter String isUnlimited;
  }
}
