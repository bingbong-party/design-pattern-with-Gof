package com.wanted.preonboarding.ticket.presentation;

import com.wanted.preonboarding.core.domain.response.ResponseHandler;
import com.wanted.preonboarding.ticket.application.TicketSeller;
import com.wanted.preonboarding.ticket.domain.dto.ReserveInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/reserve")
@RequiredArgsConstructor
public class ReserveController {
    private final TicketSeller ticketSeller;

    @PostMapping("/user")
    public ResponseHandler<Boolean> reservation(ReserveInfo reserveInfo) {
        return ResponseHandler.<Boolean>
                builder()
                .statusCode(HttpStatus.OK)
                .message("메시지")
                .data(ticketSeller.reserve(reserveInfo))
                .build();
    }
}
