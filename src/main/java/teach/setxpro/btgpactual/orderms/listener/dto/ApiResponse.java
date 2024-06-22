package teach.setxpro.btgpactual.orderms.listener.dto;

import java.util.List;
import java.util.Map;

// Vai receber qualquer lista
public record ApiResponse<T>(Map<String, Object> summary, List<T> data, PaginationResponse pagination) {
}
