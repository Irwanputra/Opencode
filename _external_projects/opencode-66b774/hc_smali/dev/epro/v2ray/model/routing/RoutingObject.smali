.class public Ldev/epro/v2ray/model/routing/RoutingObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public balancerObject:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/BalancerObject;",
            ">;"
        }
    .end annotation
.end field

.field public domainStrategy:Ljava/lang/String;

.field public ruleObject:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/RuleObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBalancerObject()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/BalancerObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->balancerObject:Ljava/util/List;

    return-object v0
.end method

.method public getDomainStrategy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->domainStrategy:Ljava/lang/String;

    return-object v0
.end method

.method public getRuleObject()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/RuleObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->ruleObject:Ljava/util/List;

    return-object v0
.end method

.method public setBalancerObject(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/BalancerObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->balancerObject:Ljava/util/List;

    return-void
.end method

.method public setDomainStrategy(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->domainStrategy:Ljava/lang/String;

    return-void
.end method

.method public setRuleObject(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/routing/RuleObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->ruleObject:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "RoutingObject{domainStrategy=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->domainStrategy:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", ruleObject="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->ruleObject:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", balancerObject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/routing/RoutingObject;->balancerObject:Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
