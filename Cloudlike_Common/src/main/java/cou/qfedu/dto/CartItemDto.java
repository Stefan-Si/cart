package cou.qfedu.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: cart
 *
 * @author: stefan si
 * time: 2020/11/4 16:19
 * description:
 */
@Data
public class CartItemDto implements Serializable {
    private Integer id;
    private Integer count;
}
