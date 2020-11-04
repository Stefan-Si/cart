package cou.qfedu.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: cart
 *
 * @author: stefan si
 * time: 2020/11/4 16:20
 * description:
 */
@Data
public class CartItemRedisDto implements Serializable {
    private int uid;
    private int skuid;
    private int count;
}
