package site.azhe.otoken.web.admin.service.fallback;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import site.azhe.otoken.common.constants.HttpStatusConstants;
import site.azhe.otoken.common.dto.BaseResult;
import site.azhe.otoken.common.utils.MapperUtils;
import site.azhe.otoken.web.admin.service.AdminService;

@Component
public class AdminServiceFallback implements AdminService {
    @Override
    public String login(String loginCode, String password) {
        BaseResult baseResult = BaseResult.not_ok(Lists.newArrayList(
                new BaseResult.Error(
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        HttpStatusConstants.BAD_GATEWAY.getContent())
        ));
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
