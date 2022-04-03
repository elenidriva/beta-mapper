package com.openfaas.function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openfaas.model.IRequest;
import com.openfaas.model.IResponse;
import com.openfaas.model.Response;
import org.apache.lucene.util.SloppyMath;

import java.util.ArrayList;
import java.util.List;

public class Handler extends com.openfaas.model.AbstractHandler {

    @Override
    public IResponse Handle(IRequest iRequest) {
        String responseBody = null;
        try {
            List<Fare> faresList = (new ObjectMapper()).readValue(iRequest.getBody(), new TypeReference<>() {
            });
            List<Fare> eligibleFares = new ArrayList<>();
            faresList.forEach(fare -> {
                double distance = SloppyMath.haversinMeters(fare.getPickupLatitude(), fare.getPickupLongitude(), fare.getDropoffLatitude(), fare.getDropoffLongitude());
                if (distance > 1000 || distance < -1000 && fare.getTripDuration() > 600 && fare.getPassengerCount() > 2) {
                    eligibleFares.add(fare);
                }
            });

            responseBody = (new ObjectMapper()).writeValueAsString(eligibleFares);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Response response = new Response();
        response.setBody(responseBody);
        return response;
    }
}
