package com.markm.jipapi;

import java.util.Objects;

/**
 *
 * @author markl
 */
public class IPLoc {

    private String as,
            city,
            country,
            countryCode,
            isp,
            latitude,
            lon,
            org,
            query,
            region,
            regionName,
            status,
            timezone,
            zip;

    /**
     *
     * @param as
     * @param city
     * @param country
     * @param countryCode
     * @param isp
     * @param latitude
     * @param lon
     * @param org
     * @param query
     * @param region
     * @param regionName
     * @param status
     * @param timezone
     * @param zip
     */
    public IPLoc(String as, String city, String country, String countryCode, String isp, String latitude, String lon, String org, String query, String region, String regionName, String status, String timezone, String zip) {
        this.as = as;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.isp = isp;
        this.latitude = latitude;
        this.lon = lon;
        this.org = org;
        this.query = query;
        this.region = region;
        this.regionName = regionName;
        this.status = status;
        this.timezone = timezone;
        this.zip = zip;
    }

    /**
     *
     * @return
     */
    public String getAs() {
        return as;
    }

    /**
     *
     * @param as
     */
    public void setAs(String as) {
        this.as = as;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     *
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     *
     * @return
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     */
    public String getLon() {
        return lon;
    }

    /**
     *
     * @param lon
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     *
     * @return
     */
    public String getOrg() {
        return org;
    }

    /**
     *
     * @param org
     */
    public void setOrg(String org) {
        this.org = org;
    }

    /**
     *
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     *
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     *
     * @return
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     *
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @param timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     *
     * @return zip
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
    @Override
    public String toString() {
        return "IPLoc{" + "as=" + as + ", city=" + city + ", country=" + country + ", countryCode=" + countryCode + ", isp=" + isp + ", latitude=" + latitude + ", lon=" + lon + ", org=" + org + ", query=" + query + ", region=" + region + ", regionName=" + regionName + ", status=" + status + ", timezone=" + timezone + ", zip=" + zip + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.as);
        hash = 67 * hash + Objects.hashCode(this.city);
        hash = 67 * hash + Objects.hashCode(this.country);
        hash = 67 * hash + Objects.hashCode(this.countryCode);
        hash = 67 * hash + Objects.hashCode(this.isp);
        hash = 67 * hash + Objects.hashCode(this.latitude);
        hash = 67 * hash + Objects.hashCode(this.lon);
        hash = 67 * hash + Objects.hashCode(this.org);
        hash = 67 * hash + Objects.hashCode(this.query);
        hash = 67 * hash + Objects.hashCode(this.region);
        hash = 67 * hash + Objects.hashCode(this.regionName);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.timezone);
        hash = 67 * hash + Objects.hashCode(this.zip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IPLoc other = (IPLoc) obj;
        if (!Objects.equals(this.as, other.as)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.countryCode, other.countryCode)) {
            return false;
        }
        if (!Objects.equals(this.isp, other.isp)) {
            return false;
        }
        if (!Objects.equals(this.latitude, other.latitude)) {
            return false;
        }
        if (!Objects.equals(this.lon, other.lon)) {
            return false;
        }
        if (!Objects.equals(this.org, other.org)) {
            return false;
        }
        if (!Objects.equals(this.query, other.query)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.regionName, other.regionName)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.timezone, other.timezone)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
     
}
