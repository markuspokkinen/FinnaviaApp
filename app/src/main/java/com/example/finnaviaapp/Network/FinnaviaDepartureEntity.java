package com.example.finnaviaapp.Network;

public class FinnaviaDepartureEntity {


    //h_apt (string, optional): IATA code of the home airport
    private String homeAirport;

    //fltnr (string, optional): Flight number
    private String flightNumber;

    //sdt (string, optional): Scheduled date-time of the flight
    private String sdt;

    //sdate (string, optional): Scheduled date of the flight
    private String sdate;

    //acreg (string, optional): Aircraft registration code
    private String aircraftRegCode;

    // actype (string, optional): Aircraft type
    private String aircraftType;

    //mfltnr (string, optional): Master flight number for codeshare flights
    private String masterFlightNumber;

    //cflight_1 (string, optional): Codeshare flight number 1
    private String flightNumber1;

    //cflight_2 (string, optional): Codeshare flight number 2
    private String flightNumber2;

    //cflight_3 (string, optional): Codeshare flight number 3
    private String flightNumber3;

    //cflight_4 (string, optional): Codeshare flight number 4
    private String flightNumber4;

    //cflight_5 (string, optional): Codeshare flight number 5
    private String flightNumber5;

    //cflight_6 (string, optional): Codeshare flight number 6
    private String flightNumber6;

    //route_1 (string, optional): IATA code of destination 1
    private String destination1;

    //route_2 (string, optional): IATA code of destination 2
    private String destination2;

    //route_3 (string, optional): IATA code of destination 3
    private String destination3;

    //route_4 (string, optional): IATA code of destination 4
    private String destination4;

    //route_n_1 (string, optional): Name of destination 1 (en)
    private String destination1en;

    //route_n_2 (string, optional): Name of destination 2 (en)
    private String destination2en;

    //route_n_3 (string, optional): Name of destination 3 (en)
    private String destination3en;

    //route_n_4 (string, optional): Name of destination 4 (en)
    private String destination4en;

    //route_n_fi_1 (string, optional): Name of destination 1 (fi)
    private String destination1fi;

    //route_n_fi_2 (string, optional): Name of destination 2 (fi)
    private String destination2fi;

    //route_n_fi_3 (string, optional): Name of destination 3 (fi)
    private String destination3fi;

    //route_n_fi_4 (string, optional): Name of destination 4 (fi)
    private String destination4fi;

    //chkarea (string, optional): Check-in area
    private String checkInArea;

    //chkdsk_1 (string, optional): Check-in desk 1
    private String checkInDesk1;

    //chkdsk_2 (string, optional):Check-in desk 2
    private String checkInDesk2;

    //calls_1 (string, optional): Go to gate
    private String goToGate;

    //calls_2 (string, optional): Boarding
    private String boarding;

    //calls_3 (string, optional): Final call
    private String finalCall;

    //calls_4 (string, optional): Closed
    private String closed;

    //park (string, optional): Park/Stand number
    private String parkStandNumber;

    //park_prv (string, optional): Previous park/stand number
    private String prevParkStandNumber;

    //gate (string, optional): Gate number
    private String gateNumber;

    //gate_prv (string, optional): Previous gate number
    private String prevGateNumber;

    //prm (string, optional): Flight status code
    private String flightStatusCode;

    //prt (string, optional): Flight status (en)
    private String flightStatusEn;

    //prt_f (string, optional): Flight status (fi)
    private String flightStatusFi;

    //prt_s (string, optional): Flight status (se)
    private String flightStatusSe;

    //est_d (string, optional): Estimated date-time of the flight
    private String estimatedDateTimeOfFlight;

    //pest_d (string, optional): Public estimated date-time of the flight
    private String publicEstimatedDateTimeOfFlight;

    //act_d (string, optional): Actual date-time of the flight
    private String actualDateTimeOfFlight;

    //ablk_d (string, optional): Actual on/off-block date-time of the aircraft
    private String ActualOnOffBlockDateTimeofAircraft;

    //callsign (string, optional): Flight callsign
    private String flightCallSign;

    /**
     * @param homeAirport h_apt (string, optional): IATA code of the home airport
     * @param flightNumber fltnr (string, optional): Flight number
     */
    public FinnaviaDepartureEntity(String homeAirport, String flightNumber, String sdt, String sdate, String aircraftRegCode, String aircraftType, String masterFlightNumber,
                                   String flightNumber1, String flightNumber2, String flightNumber3, String flightNumber4, String flightNumber5, String flightNumber6,
                                   String destination1, String destination2, String destination3, String destination4, String destination1en, String destination2en, String destination3en,
                                   String destination4en, String destination1fi, String destination2fi, String destination3fi, String destination4fi, String checkInArea,
                                   String checkInDesk1, String checkInDesk2, String goToGate, String boarding, String finalCall, String closed, String parkStandNumber,
                                   String prevParkStandNumber, String gateNumber, String prevGateNumber, String flightStatusCode, String flightStatusEn, String flightStatusFi,
                                   String flightStatusSe, String estimatedDateTimeOfFlight, String publicEstimatedDateTimeOfFlight, String actualDateTimeOfFlight,
                                   String actualOnOffBlockDateTimeofAircraft, String flightCallSign) {
        this.homeAirport = homeAirport;
        this.flightNumber = flightNumber;
        this.sdt = sdt;
        this.sdate = sdate;
        this.aircraftRegCode = aircraftRegCode;
        this.aircraftType = aircraftType;
        this.masterFlightNumber = masterFlightNumber;
        this.flightNumber1 = flightNumber1;
        this.flightNumber2 = flightNumber2;
        this.flightNumber3 = flightNumber3;
        this.flightNumber4 = flightNumber4;
        this.flightNumber5 = flightNumber5;
        this.flightNumber6 = flightNumber6;
        this.destination1 = destination1;
        this.destination2 = destination2;
        this.destination3 = destination3;
        this.destination4 = destination4;
        this.destination1en = destination1en;
        this.destination2en = destination2en;
        this.destination3en = destination3en;
        this.destination4en = destination4en;
        this.destination1fi = destination1fi;
        this.destination2fi = destination2fi;
        this.destination3fi = destination3fi;
        this.destination4fi = destination4fi;
        this.checkInArea = checkInArea;
        this.checkInDesk1 = checkInDesk1;
        this.checkInDesk2 = checkInDesk2;
        this.goToGate = goToGate;
        this.boarding = boarding;
        this.finalCall = finalCall;
        this.closed = closed;
        this.parkStandNumber = parkStandNumber;
        this.prevParkStandNumber = prevParkStandNumber;
        this.gateNumber = gateNumber;
        this.prevGateNumber = prevGateNumber;
        this.flightStatusCode = flightStatusCode;
        this.flightStatusEn = flightStatusEn;
        this.flightStatusFi = flightStatusFi;
        this.flightStatusSe = flightStatusSe;
        this.estimatedDateTimeOfFlight = estimatedDateTimeOfFlight;
        this.publicEstimatedDateTimeOfFlight = publicEstimatedDateTimeOfFlight;
        this.actualDateTimeOfFlight = actualDateTimeOfFlight;
        ActualOnOffBlockDateTimeofAircraft = actualOnOffBlockDateTimeofAircraft;
        this.flightCallSign = flightCallSign;
    }
    public FinnaviaDepartureEntity(){}

    public String getHomeAirport() {
        return homeAirport;
    }

    public void setHomeAirport(String homeAirport) {
        this.homeAirport = homeAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getAircraftRegCode() {
        return aircraftRegCode;
    }

    public void setAircraftRegCode(String aircraftRegCode) {
        this.aircraftRegCode = aircraftRegCode;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getMasterFlightNumber() {
        return masterFlightNumber;
    }

    public void setMasterFlightNumber(String masterFlightNumber) {
        this.masterFlightNumber = masterFlightNumber;
    }

    public String getFlightNumber1() {
        return flightNumber1;
    }

    public void setFlightNumber1(String flightNumber1) {
        this.flightNumber1 = flightNumber1;
    }

    public String getFlightNumber2() {
        return flightNumber2;
    }

    public void setFlightNumber2(String flightNumber2) {
        this.flightNumber2 = flightNumber2;
    }

    public String getFlightNumber3() {
        return flightNumber3;
    }

    public void setFlightNumber3(String flightNumber3) {
        this.flightNumber3 = flightNumber3;
    }

    public String getFlightNumber4() {
        return flightNumber4;
    }

    public void setFlightNumber4(String flightNumber4) {
        this.flightNumber4 = flightNumber4;
    }

    public String getFlightNumber5() {
        return flightNumber5;
    }

    public void setFlightNumber5(String flightNumber5) {
        this.flightNumber5 = flightNumber5;
    }

    public String getFlightNumber6() {
        return flightNumber6;
    }

    public void setFlightNumber6(String flightNumber6) {
        this.flightNumber6 = flightNumber6;
    }

    public String getDestination1() {
        return destination1;
    }

    public void setDestination1(String destination1) {
        this.destination1 = destination1;
    }

    public String getDestination2() {
        return destination2;
    }

    public void setDestination2(String destination2) {
        this.destination2 = destination2;
    }

    public String getDestination3() {
        return destination3;
    }

    public void setDestination3(String destination3) {
        this.destination3 = destination3;
    }

    public String getDestination4() {
        return destination4;
    }

    public void setDestination4(String destination4) {
        this.destination4 = destination4;
    }

    public String getDestination1en() {
        return destination1en;
    }

    public void setDestination1en(String destination1en) {
        this.destination1en = destination1en;
    }

    public String getDestination2en() {
        return destination2en;
    }

    public void setDestination2en(String destination2en) {
        this.destination2en = destination2en;
    }

    public String getDestination3en() {
        return destination3en;
    }

    public void setDestination3en(String destination3en) {
        this.destination3en = destination3en;
    }

    public String getDestination4en() {
        return destination4en;
    }

    public void setDestination4en(String destination4en) {
        this.destination4en = destination4en;
    }

    public String getDestination1fi() {
        return destination1fi;
    }

    public void setDestination1fi(String destination1fi) {
        this.destination1fi = destination1fi;
    }

    public String getDestination2fi() {
        return destination2fi;
    }

    public void setDestination2fi(String destination2fi) {
        this.destination2fi = destination2fi;
    }

    public String getDestination3fi() {
        return destination3fi;
    }

    public void setDestination3fi(String destination3fi) {
        this.destination3fi = destination3fi;
    }

    public String getDestination4fi() {
        return destination4fi;
    }

    public void setDestination4fi(String destination4fi) {
        this.destination4fi = destination4fi;
    }

    public String getCheckInArea() {
        return checkInArea;
    }

    public void setCheckInArea(String checkInArea) {
        this.checkInArea = checkInArea;
    }

    public String getCheckInDesk1() {
        return checkInDesk1;
    }

    public void setCheckInDesk1(String checkInDesk1) {
        this.checkInDesk1 = checkInDesk1;
    }

    public String getCheckInDesk2() {
        return checkInDesk2;
    }

    public void setCheckInDesk2(String checkInDesk2) {
        this.checkInDesk2 = checkInDesk2;
    }

    public String getGoToGate() {
        return goToGate;
    }

    public void setGoToGate(String goToGate) {
        this.goToGate = goToGate;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getFinalCall() {
        return finalCall;
    }

    public void setFinalCall(String finalCall) {
        this.finalCall = finalCall;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getParkStandNumber() {
        return parkStandNumber;
    }

    public void setParkStandNumber(String parkStandNumber) {
        this.parkStandNumber = parkStandNumber;
    }

    public String getPrevParkStandNumber() {
        return prevParkStandNumber;
    }

    public void setPrevParkStandNumber(String prevParkStandNumber) {
        this.prevParkStandNumber = prevParkStandNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getPrevGateNumber() {
        return prevGateNumber;
    }

    public void setPrevGateNumber(String prevGateNumber) {
        this.prevGateNumber = prevGateNumber;
    }

    public String getFlightStatusCode() {
        return flightStatusCode;
    }

    public void setFlightStatusCode(String flightStatusCode) {
        this.flightStatusCode = flightStatusCode;
    }

    public String getFlightStatusEn() {
        return flightStatusEn;
    }

    public void setFlightStatusEn(String flightStatusEn) {
        this.flightStatusEn = flightStatusEn;
    }

    public String getFlightStatusFi() {
        return flightStatusFi;
    }

    public void setFlightStatusFi(String flightStatusFi) {
        this.flightStatusFi = flightStatusFi;
    }

    public String getFlightStatusSe() {
        return flightStatusSe;
    }

    public void setFlightStatusSe(String flightStatusSe) {
        this.flightStatusSe = flightStatusSe;
    }

    public String getEstimatedDateTimeOfFlight() {
        return estimatedDateTimeOfFlight;
    }

    public void setEstimatedDateTimeOfFlight(String estimatedDateTimeOfFlight) {
        this.estimatedDateTimeOfFlight = estimatedDateTimeOfFlight;
    }

    public String getPublicEstimatedDateTimeOfFlight() {
        return publicEstimatedDateTimeOfFlight;
    }

    public void setPublicEstimatedDateTimeOfFlight(String publicEstimatedDateTimeOfFlight) {
        this.publicEstimatedDateTimeOfFlight = publicEstimatedDateTimeOfFlight;
    }

    public String getActualDateTimeOfFlight() {
        return actualDateTimeOfFlight;
    }

    public void setActualDateTimeOfFlight(String actualDateTimeOfFlight) {
        this.actualDateTimeOfFlight = actualDateTimeOfFlight;
    }

    public String getActualOnOffBlockDateTimeofAircraft() {
        return ActualOnOffBlockDateTimeofAircraft;
    }

    public void setActualOnOffBlockDateTimeofAircraft(String actualOnOffBlockDateTimeofAircraft) {
        ActualOnOffBlockDateTimeofAircraft = actualOnOffBlockDateTimeofAircraft;
    }

    public String getFlightCallSign() {
        return flightCallSign;
    }

    public void setFlightCallSign(String flightCallSign) {
        this.flightCallSign = flightCallSign;
    }

    @Override
    public String toString() {
        return "FinnaviaDepartureEntity{" +
                "homeAirport='" + homeAirport + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", sdt='" + sdt + '\'' +
                ", sdate='" + sdate + '\'' +
                ", aircraftRegCode='" + aircraftRegCode + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", masterFlightNumber='" + masterFlightNumber + '\'' +
                ", flightNumber1='" + flightNumber1 + '\'' +
                ", flightNumber2='" + flightNumber2 + '\'' +
                ", flightNumber3='" + flightNumber3 + '\'' +
                ", flightNumber4='" + flightNumber4 + '\'' +
                ", flightNumber5='" + flightNumber5 + '\'' +
                ", flightNumber6='" + flightNumber6 + '\'' +
                ", destination1='" + destination1 + '\'' +
                ", destination2='" + destination2 + '\'' +
                ", destination3='" + destination3 + '\'' +
                ", destination4='" + destination4 + '\'' +
                ", destination1en='" + destination1en + '\'' +
                ", destination2en='" + destination2en + '\'' +
                ", destination3en='" + destination3en + '\'' +
                ", destination4en='" + destination4en + '\'' +
                ", destination1fi='" + destination1fi + '\'' +
                ", destination2fi='" + destination2fi + '\'' +
                ", destination3fi='" + destination3fi + '\'' +
                ", destination4fi='" + destination4fi + '\'' +
                ", checkInArea='" + checkInArea + '\'' +
                ", checkInDesk1='" + checkInDesk1 + '\'' +
                ", checkInDesk2='" + checkInDesk2 + '\'' +
                ", goToGate='" + goToGate + '\'' +
                ", boarding='" + boarding + '\'' +
                ", finalCall='" + finalCall + '\'' +
                ", closed='" + closed + '\'' +
                ", parkStandNumber='" + parkStandNumber + '\'' +
                ", prevParkStandNumber='" + prevParkStandNumber + '\'' +
                ", gateNumber='" + gateNumber + '\'' +
                ", prevGateNumber='" + prevGateNumber + '\'' +
                ", flightStatusCode='" + flightStatusCode + '\'' +
                ", flightStatusEn='" + flightStatusEn + '\'' +
                ", flightStatusFi='" + flightStatusFi + '\'' +
                ", flightStatusSe='" + flightStatusSe + '\'' +
                ", estimatedDateTimeOfFlight='" + estimatedDateTimeOfFlight + '\'' +
                ", publicEstimatedDateTimeOfFlight='" + publicEstimatedDateTimeOfFlight + '\'' +
                ", actualDateTimeOfFlight='" + actualDateTimeOfFlight + '\'' +
                ", ActualOnOffBlockDateTimeofAircraft='" + ActualOnOffBlockDateTimeofAircraft + '\'' +
                ", flightCallSign='" + flightCallSign + '\'' +
                '}';
    }
}