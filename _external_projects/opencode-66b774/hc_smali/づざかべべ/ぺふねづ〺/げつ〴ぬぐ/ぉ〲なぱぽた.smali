.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/ArrayList;

.field public final synthetic くし〴〺ぅ:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;Ljava/util/ArrayList;Ljava/util/Map;)V
    .registers 4

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;->〺つふすそ:Ljava/util/ArrayList;

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_23

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ごづごきえ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぉ〲なぱぽた;->くし〴〺ぅ:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ごまけがぢは(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_23
    return-void
.end method
