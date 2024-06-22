package teach.setxpro.btgpactual.orderms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import teach.setxpro.btgpactual.orderms.entity.OrderEntity;
import teach.setxpro.btgpactual.orderms.listener.dto.OrderResponse;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
