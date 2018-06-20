package io.sltstatistic.constant;

/**
 * @author zhaozhihong
 * @create 2018-06-08 16:36
 * @desc
 **/
public class ConstantEnum {

    public enum IouStatus {
        /**
         * 已发布
         */
        PUBLISH((byte) 0, "已发布"),
        /**
         * 已锁定待放款
         */
        LOCK((byte) 1, "已锁定待放款"),
        /**
         * 已放款待确认
         */
        PAY_UN_CONFIRM((byte) 2, "已放款待确认"),
        /**
         * 借款成功
         */
        PAY_CONFIRM((byte) 3, "借款成功"),
        /**
         * 已还款待确认
         */
        REPAY_UN_CONFIRM((byte) 4, "已还款待确认"),
        /**
         * 确认还款
         */
        REPAY_CONFIRM((byte) 5, "还款成功（确认还款）"),
        /**
         * 已过募集期
         */
        EXPIRED((byte) 8, "已过募集期"),
        /**
         * 取消借款
         */
        CANCEL((byte) 6, "取消借款"),
        /**
         * 拒绝借款
         */
        REJECT((byte) 7, "拒绝借款");

        public final byte value;
        public final String discription;

        IouStatus(byte value, String discription) {
            this.value = value;
            this.discription = discription;
        }

        public static String match(byte value) {
            for (IouStatus item : values()) {
                if (item.value == value) {
                    return item.discription;
                }
            }
            return null;
        }
    }

    /**
     * 借条申诉状态
     */
    public enum IouAppealStatus {
        /**
         * 默认
         */
        DEFAULT((byte) 0, "未申诉"),
        /**
         * 申诉中
         */
        APPEALING((byte) 1, "申诉中"),
        /**
         * 申诉完成
         */
        CANCEL((byte) 2, "申诉完成");

        public final byte value;
        public final String discription;

        IouAppealStatus(byte value, String discription) {
            this.value = value;
            this.discription = discription;
        }

        public byte getValue() {
            return value;
        }

        public static String match(byte value) {
            for (IouAppealStatus item : values()) {
                if (item.value == value) {
                    return item.discription;
                }
            }
            return null;
        }
    }

    public enum SltAwardScene {
        REAL_NANE(0,  "实名"),
        TO_LENDER_BUY_BASIC_CREDIT_REPORT(1,  "购买基础征信报告，奖给出借人"),
        TO_LENDER_BUY_SENIOR_CREDIT_REPORT(2,  "购买高级征信报告，奖给出借人"),
        TO_LENDER_BUY_ALL_CREDIT_REPORT(3, "购买全部报告奖给出借人"),
        TO_BORROWER_PROVIDE_CREDIT_REPORT(4, "购买高级征信报告，奖给借款人"),
        TO_LENDER_CONFIRM_PAY(5,  "借款人确认收款，奖给出借人"),
        TO_BORROWER_CONFIRM_PAY(6,  "出借人确认回款，奖给借款人");

        public Integer code;
        public String scene;

        public Integer getCode() {
            return code;
        }


        public String getScene() {
            return scene;
        }

        SltAwardScene(Integer code, String scene) {
            this.code = code;
            this.scene = scene;
        }

        public static String match(byte value) {
            for (SltAwardScene item : values()) {
                if (item.code == value) {
                    return item.scene;
                }
            }
            return null;
        }

    }

    /**
     * 支付类型
     */
    public enum PayType {
        /**
         * 实名收费
         */
        CERTIFICATE((byte) 1, "实名收费"),
        /**
         * 基础
         */
        BASIC((byte) 2, "购买基础报告"),
        /**
         * 高级
         */
        SENIOR((byte) 3, "购买高级报告"),
        /**
         * 所有报告
         */
        ALL((byte) 4, "购买所有报告");
        public final byte code;
        public final String message;

        PayType(byte code, String message) {
            this.code = code;
            this.message = message;
        }

        public static PayType getEnumByCode(Byte code) {
            for (PayType Status : PayType.values()) {
                if (Status.code == code) {
                    return Status;
                }
            }
            return null;
        }

        public static String getMessageByCode(Byte code) {
            String message = "";
            PayType payType = getEnumByCode(code);
            if (null != payType) {
                message = payType.message;
            }
            return message;
        }

        public static PayType getEnumByMessage(String message) {
            for (PayType Status : PayType.values()) {
                if (Status.message.equals(message)) {
                    return Status;
                }
            }
            return null;
        }

        public static Byte getCodeByMessage(String message) {
            Byte code = null;
            PayType payType = getEnumByMessage(message);
            if (null != payType) {
                code = payType.code;
            }
            return code;
        }

    }
}
