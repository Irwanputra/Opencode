.class public Landroidx/fragment/app/Fragment$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->びえぁぜい()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    iput-object p1, p0, Landroidx/fragment/app/Fragment$2;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 3

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_d

    iget-object p1, p0, Landroidx/fragment/app/Fragment$2;->げつ〴ぬぐ:Landroidx/fragment/app/Fragment;

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_d
    return-void
.end method
