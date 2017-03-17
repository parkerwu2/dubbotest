package dubbolearn.testimpl;

import dubbolearn.testapi.IProductService;
import org.springframework.stereotype.Service;

/**
 * Created by parker on 2017/3/17.
 */
@Service
public class ProductServiceImpl implements IProductService {
        public String getProductName() {
            return "jim";
        }
}
