package com.example.finnaviaapp.Network;

public class FinnaviaEntity {
    /*
    cflight_3 (string, optional): Codeshare flight number 3 ,
    cflight_4 (string, optional): Codeshare flight number 4 ,
    cflight_5 (string, optional): Codeshare flight number 5 ,
    cflight_6 (string, optional): Codeshare flight number 6 ,
    route_1 (string, optional): IATA code of destination 1 ,
    route_2 (string, optional): IATA code of destination 2 ,
    route_3 (string, optional): IATA code of destination 3 ,
    route_4 (string, optional): IATA code of destination 4 ,
    route_n_1 (string, optional): Name of destination 1 (en) ,
    route_n_2 (string, optional): Name of destination 2 (en) ,
    route_n_3 (string, optional): Name of destination 3 (en) ,
    route_n_4 (string, optional): Name of destination 4 (en) ,
    route_n_fi_1 (string, optional): Name of destination 1 (fi) ,
    route_n_fi_2 (string, optional): Name of destination 2 (fi) ,
    route_n_fi_3 (string, optional): Name of destination 3 (fi) ,
    route_n_fi_4 (string, optional): Name of destination 4 (fi) ,
    chkarea (string, optional): Check-in area ,
    chkdsk_1 (string, optional): Check-in desk 1 ,
    chkdsk_2 (string, optional):Check-in desk 2 ,
    calls_1 (string, optional): Go to gate ,
    calls_2 (string, optional): Boarding ,
    calls_3 (string, optional): Final call ,
    calls_4 (string, optional): Closed ,
    park (string, optional): Park/Stand number ,
    park_prv (string, optional): Previous park/stand number ,
    gate (string, optional): Gate number ,
    gate_prv (string, optional): Previous gate number ,
    prm (string, optional): Flight status code ,
    prt (string, optional): Flight status (en) ,
    prt_f (string, optional): Flight status (fi) ,
    prt_s (string, optional): Flight status (se) ,
    est_d (string, optional): Estimated date-time of the flight ,
    pest_d (string, optional): Public estimated date-time of the flight ,
    act_d (string, optional): Actual date-time of the flight ,
    ablk_d (string, optional): Actual on/off-block date-time of the aircraft ,
    callsign (string, optional): Flight callsign
     */

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
    private String getFlightNumber2;

    //
}
