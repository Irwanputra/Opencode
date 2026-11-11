.class public Ldev/epro/v2ray/bean/routing/RoutingBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public domainStrategy:Ljava/lang/String;

.field public rules:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/routing/RulesBean;",
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
.method public getDomainStrategy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->domainStrategy:Ljava/lang/String;

    return-object v0
.end method

.method public getRules()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/routing/RulesBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->rules:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setDomainStrategy(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->domainStrategy:Ljava/lang/String;

    return-void
.end method

.method public setRules(Ljava/util/ArrayList;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/epro/v2ray/bean/routing/RulesBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->rules:Ljava/util/ArrayList;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "RoutingBean{domainStrategy=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->domainStrategy:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", rules="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/routing/RoutingBean;->rules:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
