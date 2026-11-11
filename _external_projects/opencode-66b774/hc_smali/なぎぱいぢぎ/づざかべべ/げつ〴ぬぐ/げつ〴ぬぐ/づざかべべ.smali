.class public Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionMenu;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionMenu;

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, v0, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    .line 2
    iget-object v0, v0, Lcom/github/clans/fab/FloatingActionMenu;->くぎぶ〼のそ:Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;

    if-eqz v0, :cond_e

    .line 3
    check-cast v0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ(Z)V

    :cond_e
    return-void
.end method
