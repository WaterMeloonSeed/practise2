package task4.part2;

import java.time.LocalDate;

public class TransportAlert {
    private AlertSeverity severity;
    private String message;
    private int transportNumber;
    private LocalDate timestamp;
    private String transportDetails;

    public TransportAlert(AlertSeverity severity, String message, int transportNumber, LocalDate timestamp, String transportDetails) {
        this.severity = severity;
        this.message = message;
        this.transportNumber = transportNumber;
        this.timestamp = timestamp;
        this.transportDetails = transportDetails;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getTransportNumber() {
        return transportNumber;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getTransportDetails() {
        return transportDetails;
    }

    @Override
    public String toString() {
        return "TransportAlert{" +
                "severity=" + severity +
                ", message='" + message + '\'' +
                ", transportNumber=" + transportNumber +
                ", timestamp=" + timestamp +
                ", transportDetails='" + transportDetails + '\'' +
                '}';
    }
}

