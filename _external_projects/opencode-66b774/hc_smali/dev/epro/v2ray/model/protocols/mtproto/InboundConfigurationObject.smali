.class public Ldev/epro/v2ray/model/protocols/mtproto/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public user:Ldev/epro/v2ray/model/protocols/mtproto/UserObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getUser()Ldev/epro/v2ray/model/protocols/mtproto/UserObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/mtproto/InboundConfigurationObject;->user:Ldev/epro/v2ray/model/protocols/mtproto/UserObject;

    return-object v0
.end method

.method public setUser(Ldev/epro/v2ray/model/protocols/mtproto/UserObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/mtproto/InboundConfigurationObject;->user:Ldev/epro/v2ray/model/protocols/mtproto/UserObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "InboundConfigurationObject{user="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/mtproto/InboundConfigurationObject;->user:Ldev/epro/v2ray/model/protocols/mtproto/UserObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
