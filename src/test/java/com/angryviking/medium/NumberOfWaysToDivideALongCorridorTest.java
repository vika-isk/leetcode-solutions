package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfWaysToDivideALongCorridorTest {

    @ParameterizedTest
    @CsvSource({"SSPPSPS, 3", "PPSPSP, 1", "S, 0", "SSPPPS, 0", "SSPPPPSPSPPSPSP, 15", "P, 0",
            "SSSPSPPSSPPSSPPPSSSSPSSPSSPPPP,144",
            "PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS,18335643"})
    void numberOfWaysTest(String corridor, int expectedResult) {
        NumberOfWaysToDivideALongCorridor algorithm = new NumberOfWaysToDivideALongCorridor();
        int result = algorithm.numberOfWays(corridor);
        assertEquals(expectedResult, result);
    }

}
