package cou.qfedu.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: cart
 *
 * @author: stefan si
 * time: 2020/11/4 16:18
 * description:
 */
@Data
public class CartDelDto implements Serializable{
    private Integer uid;
    private Integer Skuid;
}
