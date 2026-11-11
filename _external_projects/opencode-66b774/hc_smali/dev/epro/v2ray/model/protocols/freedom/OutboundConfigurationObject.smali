.class public Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public domainStrategy:Ljava/lang/String;

.field public redirect:Ljava/lang/String;

.field public userLevel:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDomainStrategy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->domainStrategy:Ljava/lang/String;

    return-object v0
.end method

.method public getRedirect()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->redirect:Ljava/lang/String;

    return-object v0
.end method

.method public getUserLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->userLevel:I

    return v0
.end method

.method public setDomainStrategy(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->domainStrategy:Ljava/lang/String;

    return-void
.end method

.method public setRedirect(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->redirect:Ljava/lang/String;

    return-void
.end method

.method public setUserLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->userLevel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "OutboundConfigurationObject{domainStrategy=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->domainStrategy:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", redirect=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->redirect:Ljava/lang/String;

    const-string v3, ", userLevel="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/protocols/freedom/OutboundConfigurationObject;->userLevel:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
