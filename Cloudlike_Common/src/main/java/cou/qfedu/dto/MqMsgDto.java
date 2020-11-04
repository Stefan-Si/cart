package cou.qfedu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: CloudLike
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-11-03 10:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MqMsgDto implements Serializable {
    private long id;//唯一id
    private int type;//消息类型
    private Object data;//消息的内容
}
