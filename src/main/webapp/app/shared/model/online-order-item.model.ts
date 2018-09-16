import { IOnlineOrder } from 'app/shared/model//online-order.model';
import { IArticle } from 'app/shared/model//article.model';

export interface IOnlineOrderItem {
    id?: number;
    orderAmount?: number;
    itemPrice?: number;
    onlineOrder?: IOnlineOrder;
    article?: IArticle;
    order?: number;
    articleName?: string;
}

export class OnlineOrderItem implements IOnlineOrderItem {
    constructor(
        public id?: number,
        public orderAmount?: number,
        public itemPrice?: number,
        public onlineOrder?: IOnlineOrder,
        public article?: IArticle
    ) {}
}
