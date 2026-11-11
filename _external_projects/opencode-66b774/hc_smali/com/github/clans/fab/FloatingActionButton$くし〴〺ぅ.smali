.class public Lcom/github/clans/fab/FloatingActionButton$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionButton;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton$くし〴〺ぅ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 3

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton$くし〴〺ぅ;->〺つふすそ:Lcom/github/clans/fab/FloatingActionButton;

    .line 1
    iget-object v0, p1, Lcom/github/clans/fab/FloatingActionButton;->ぉざぅち〻:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_9

    .line 2
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_9
    return-void
.end method
