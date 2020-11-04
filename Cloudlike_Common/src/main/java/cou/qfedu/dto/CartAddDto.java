package cou.qfedu.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: cart
 *
 * @author: stefan si
 * time: 2020/11/4 16:17
 * description:
 */
@Data
public class CartAddDto implements Serializable {
    private int skuid;
    private int uid;
    private int jprice;
    private int count;
}
