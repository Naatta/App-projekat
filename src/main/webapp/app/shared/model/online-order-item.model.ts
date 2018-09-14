import { IOnlineOrder } from 'app/shared/model//online-order.model';

export interface IOnlineOrderItem {
    id?: number;
    orderAmount?: number;
    itemPrice?: number;
    onlineOrder?: IOnlineOrder;
}

export class OnlineOrderItem implements IOnlineOrderItem {
    constructor(public id?: number, public orderAmount?: number, public itemPrice?: number, public onlineOrder?: IOnlineOrder) {}
}
